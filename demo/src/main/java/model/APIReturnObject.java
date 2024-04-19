package model;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class APIReturnObject {
	private String message;
	
	private Map<String, Object> data;


@PostMapping("create")
public APIReturnObject create(@RequestBody User user) {
APIReturnObject result = new APIReturnObject();
Map<String, Object> data = new HashMap<String, Object>();
Object stockUserService;
Integer user_id = stockUserService.addUser(user);
data.put("user_id", user_id);
result.setMessage("用戶資料新增成功");
result.setData(data);
return result;
}

private void setData(Map<String, Object> data2) {
	// TODO Auto-generated method stub
	
}

private void setMessage(String string) {
	// TODO Auto-generated method stub
	
}
}