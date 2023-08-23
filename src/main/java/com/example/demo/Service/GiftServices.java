package com.example.demo.Service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.GiftEntity;
import com.example.demo.Repository.GiftRepo;

@Service
public class GiftServices {
	@Autowired
	GiftRepo gr;
	//displays all records
	public List<GiftEntity> showinfo()
	{
		return gr.findAll();
	}
	//inputs as list
	public List<GiftEntity> saveinfo(List<GiftEntity> ge)
	{
		return gr.saveAll(ge);
	}
	//delete by total input
	public void deleteinfo(GiftEntity ge)
	{
		gr.delete(ge);
	}
	//delete by id
	public void deleteid(int id)
	{
		gr.deleteById(id);
	}
	//put by id
	public String updateinfobyid(int id,GiftEntity ge)
	{
		gr.saveAndFlush(ge);
		if(gr.existsById(id))
		{
			return "updated";
		}
		else
		{
			return "Not Updated";
		}
	}
	///update info
	public GiftEntity updateinfo(GiftEntity ge)
	{
		return gr.saveAndFlush(ge);
	}
	
	///get by id
		public Optional<GiftEntity> findid(int id)
		{
			return gr.findById(id);
		}
	
	

}
