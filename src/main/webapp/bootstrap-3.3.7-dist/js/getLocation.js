// �ٶȵ�ͼAPI����
   // var map = new BMap.Map("allmap");
    var point = new BMap.Point(108.95,34.27);
    //map.centerAndZoom(point,12);

    var geolocation = new BMap.Geolocation();
    geolocation.getCurrentPosition(function(r){console.log(r.point)
        if(this.getStatus() == BMAP_STATUS_SUCCESS){
            var mk = new BMap.Marker(r.point);
            //map.addOverlay(mk);//������ڵ�
           // map.panTo(r.point);//��ͼ�����ƶ�
            //alert('����λ�ã�'+r.point.lng+','+r.point.lat);
            var point = new BMap.Point(r.point.lng,r.point.lat);//������λ�ľ�γ�Ȳ������ڵ�ʡ�нֵ�����Ϣ
            var gc = new BMap.Geocoder();
            gc.getLocation(point, function(rs){
               var addComp = rs.addressComponents;
               var locationStr = rs.address;
               console.log(rs.address);//��ַ��Ϣ
               var showLocation = document.getElementById("locationNow")
               showLocation.value=locationStr;
             //  alert(rs.address);//�������ڵ�ַ

            });
        }else {
            alert('failed'+this.getStatus());
        }        
    },{enableHighAccuracy: true})