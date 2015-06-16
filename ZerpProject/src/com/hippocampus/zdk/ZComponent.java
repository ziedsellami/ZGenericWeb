package com.hippocampus.zdk;

import com.hippocampus.zabstacts.Z;
import com.hippocampus.zinterfaces.ZComponentToHtml;

public abstract class ZComponent extends Z implements ZComponentToHtml {
	private String _name;

	private String _type;
	private Boolean _status;
	private boolean formVisibility;
	private boolean treeVisibility;

	public String get_type() {
		return _type;
	}

	public void set_type(String _type) {
		this._type = _type;
	}

	public Boolean get_status() {
		return _status;
	}

	public void set_status(Boolean _status) {
		this._status = _status;
	}

	public ZComponent(String _name, String _type, Boolean _status,
			boolean formVisibility, boolean treeVisibility) {
		if (ZSyntax.verifName(_name)) {
			this.set_name(_name);
			this._type = _type;
			this._status = _status;
			this.setFormVisibility(formVisibility);
			this.setTreeVisibility(treeVisibility);
		} else {
			try {
				throw new ZExceptions("Z000000003", true);
			} catch (ZExceptions e) {

				e.printStackTrace();
			}
		}
	}

	public abstract String generateTag();

	public String get_name() {
		return _name;
	}

	public void set_name(String _name) {
		this._name = _name;
	}

	public boolean isTreeVisibility() {
		return treeVisibility;
	}

	public void setTreeVisibility(boolean treeVisibility) {
		this.treeVisibility = treeVisibility;
	}

	public boolean isFormVisibility() {
		return formVisibility;
	}

	public void setFormVisibility(boolean formVisibility) {
		this.formVisibility = formVisibility;
	}

}
