package com.graduationdesign.lj.springboot.service.impl;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.graduationdesign.lj.springboot.config.Const;
import com.graduationdesign.lj.springboot.mapper.UploadImgMapper;
import com.graduationdesign.lj.springboot.pojo.DefaultResp;
import com.graduationdesign.lj.springboot.pojo.UploadImg;
import com.graduationdesign.lj.springboot.pojo.Userlogin;
import com.graduationdesign.lj.springboot.service.UploadImgService;


@Service
public class UploadImgServiceImp implements UploadImgService{
	@Autowired 
	private UploadImgMapper uploadImgMapper;

	@Override
	public DefaultResp<String> upload(MultipartFile file,
			HttpServletRequest request) {
		// TODO Auto-generated method stub
		DefaultResp<String> resp = new DefaultResp<>();
		UploadImg tGraduationFile = new UploadImg();
        HttpSession session = request.getSession();
        Userlogin tGraduationUser = (Userlogin) session.getAttribute("userInfo");
        try {
            if (file.isEmpty()) {
                resp.setCode(Const.ERROR);
                resp.setMsg(Const.ERROR_MSG);
                resp.setData("文件为空");
                return resp;
            }
            // 获取文件名
            String fileName = file.getOriginalFilename();
            System.out.println("文件名是："+fileName);
            // 获取文件的后缀名
            String suffixName = fileName.substring(fileName.lastIndexOf("."));
            System.out.println("后缀名是:"+suffixName);
            // 设置文件存储路径
            String filePath = "D:/graduationDesign/var/uploaded_files";
            String path = filePath + fileName ;

           tGraduationFile.setFile_name(fileName);
           tGraduationFile.setLocation(filePath);
           tGraduationFile.setUpload_user(tGraduationUser.getPerson_id());
           tGraduationFile.setRole_id(tGraduationUser.getRole_id());

           int count = uploadImgMapper.insert(tGraduationFile);
           if(count == 0){
               resp.setCode(Const.ERROR);
               resp.setMsg(Const.ERROR_MSG);
               resp.setData("存库失败");
               return resp;
           }

            File dest = new File(path);
            // 检测是否存在目录
            if (!dest.getParentFile().exists()) {
                dest.getParentFile().mkdirs();// 新建文件夹
            }
            file.transferTo(dest);// 文件写入
            resp.setCode(Const.SUCCESS);
            resp.setMsg(Const.SUCCESS_MSG);
            resp.setData("上传成功");
            return resp;
        } catch (IllegalStateException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        resp.setCode(Const.ERROR);
        resp.setMsg(Const.ERROR_MSG);
        resp.setData("上传失败");
        return resp;
	}

}
