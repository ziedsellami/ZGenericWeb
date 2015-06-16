package com.hippocampus.zdk;

import java.util.Vector;

import com.hippocampus.zabstacts.Z;
import com.hippocampus.zabstacts.ZObject;

public class ZMenu extends Z {

	private String _name ;
	private ZObject zObject;
	private Vector<ZMenu> zmenuChield =null;
	public ZMenu(String _name, ZObject zObject) {
		super();
		this._name = _name;
		this.zObject = zObject;
	}
	public String get_name() {
		return _name;
	}
	public void set_name(String _name) {
		this._name = _name;
	}
	public ZObject getzContainer() {
		return zObject;
	}
	public void setzContainer(ZObject zObject) {
		this.zObject = zObject;
	}
	public Vector<ZMenu> getZmenuChield() {
		return zmenuChield;
	}
	public void setZmenuChield(Vector<ZMenu> zmenuChield) {
		this.zmenuChield = zmenuChield;
	}
	public void addZMenuChield(ZMenu zmenu){
		if (this.hashCode()==zmenu.hashCode())
		{
			try {
				throw new ZExceptions("Z000000005", false);
			} catch (ZExceptions e) {
				
				e.printStackTrace();
			}
		}
		if (zmenuChield == null){
			this.zmenuChield = new Vector<ZMenu>();
		}
		zmenuChield.add(zmenu);
	}
	

}
