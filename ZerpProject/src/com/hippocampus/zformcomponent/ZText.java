package com.hippocampus.zformcomponent;

import java.sql.SQLException;

import com.hippocampus.fromzdktosgbd.engine.ZSgbdConnexion;
import com.hippocampus.statics.Statics;
import com.hippocampus.zdk.ZExceptions;

public class ZText extends ZFormComponent {

//	protected static Boolean _status =true; //true if the tag is simple tag or composed that will be false like select tag

	private String _value="";
	private String _placeHolder="";
	private int _size=0;
	
	
	public ZText(String _name,  String _value,String _placeHolder, int _size, boolean formVisibility ,boolean treeVisibility) {
		super(_name, Statics.Ztext, true,formVisibility,treeVisibility);
		this._value = _value;
		this._placeHolder = _placeHolder;
		if (_size >=0){
		this._size = _size;
		}
		else
		{
			try {
				throw new ZExceptions("Z000000004", true);
			} catch (ZExceptions e) {
				e.printStackTrace();
			}
		}
		this.set_name(_name);
	}

	

	public String get_value() {
		return _value;
	}
	public void set_value(String _value) {
		this._value = _value;
	}
	public String get_placeHolder() {
		return _placeHolder;
	}
	public void set_placeHolder(String _placeHolder) {
		this._placeHolder = _placeHolder;
	}
	public int get_size() {
		return _size;
	}
	public void set_size(int _size) {
		this._size = _size;
	}

	@Override
	public String generateTag() {
	String ret= "<input type=\""+get_type()+"\"";
	if (this.get_placeHolder()!=""){
		ret =ret+" placeholder=\""+this.get_placeHolder()+"\"";
	}
	if (get_value()!=""){
		ret = ret +" value=\""+this.get_value()+"\"";
	}
	if (get_size()>0)
		ret = ret +" size= \""+this.get_size()+"\"";
		
		
		return ret+" />";
	}



	public void insertZComponent() {
		ZSgbdConnexion connexion =ZSgbdConnexion.getInstance();
		
			connexion.insertZTextSchema(this);
		
		
	}



}
