package com.hippocampus.zformcomponent;

import java.util.ArrayList;
import java.util.List;

import com.hippocampus.fromzdktosgbd.engine.SgbdInvoker;
import com.hippocampus.onto.ZChoice;
import com.hippocampus.zdk.ZComponent;
import com.hippocampus.zdk.ZExceptions;

public abstract class ZFormComponent extends ZComponent implements SgbdInvoker {

	private String _dbfieldname="";
	protected List<ZChoice> composedChoice = new ArrayList<ZChoice>();
	protected ZFormComponent(String _name, String _type, Boolean _status, boolean formVisibility ,boolean treeVisibility) {
		super(_name, _type, _status,  formVisibility , treeVisibility);
		
	}
	public  void addChoice(ZChoice choice){
		if (this.get_status()==true){
	
			try {
				throw new ZExceptions("Z000000008", true);
			} catch (ZExceptions e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public String get_dbfieldname() {
		return _dbfieldname;
	}
	public void set_dbfieldname(String _dbfieldname) {
		this._dbfieldname = _dbfieldname;
	}
	public abstract String generateTag();
}
