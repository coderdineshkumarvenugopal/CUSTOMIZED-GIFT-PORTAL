package com.example.demo.Controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.GiftEntity;
import com.example.demo.Service.GiftServices;

@RestController
public class GiftController {
	@Autowired
	GiftServices gs;
	@GetMapping("showdetails")
	public List<GiftEntity> getinfo()
	{
		return gs.showinfo();
	}
@PostMapping("additems")
public List<GiftEntity> addinfo(@RequestBody List<GiftEntity>ge)
{
	return gs.saveinfo(ge);
}

@DeleteMapping("deletedetail")
public String delete(@RequestBody GiftEntity ge)
{
	gs.deleteinfo(ge);
	return "msg deleted successfully!!!";
}
@DeleteMapping("delid/{id}")
public String deletemyid(@PathVariable int id)
{
	gs.deleteid(id);
	return "deletion sucessfully done by id";
}


@GetMapping("getid/{id}")
public Optional<GiftEntity> showid(@PathVariable int id)
{
	return gs.findid(id);
}
@PutMapping("update/{id}")
public String modify(@PathVariable int id,@RequestBody GiftEntity ss)
{
	return gs.updateinfobyid(id, ss);
}
@PutMapping("updates")
public GiftEntity modify(@RequestBody GiftEntity ge)
{
	return gs.updateinfo(ge);
}


}
