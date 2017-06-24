function test() {
	
	$.ajax({
		type:"POST",
		url:"test/select",
		data:{
            "id" : "1"
        },
        
		success:function(data){
			alert(data);
		},
		error:function(e){
			alert(2);
		}
	});
//	$.ajax({
//		type:"POST",
//		url:"test/",
//        contentType: "json",
//		success:function(data){
//			alert(data);
//		},
//		error: function(XMLHttpRequest, textStatus, errorThrown) {
//			 alert(XMLHttpRequest.status);
//			 alert (XMLHttpRequest.readyState);
//			 alert(textStatus);
//		}
//	});
	
}