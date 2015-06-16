package com.hippocampus.zformcomponent;

import java.util.Vector;

import com.hippocampus.statics.Statics;
import com.hippocampus.zabstacts.ZObject;
import com.hippocampus.zdk.ZComponent;
import com.hippocampus.zinterfaces.ZContainer;
import com.hippocampus.zinterfaces.ZContainerToHtml;

public class ZFormContainer extends ZObject implements ZContainer,
		ZContainerToHtml {

	private String _action = "";
	private String _methode = "POST";
	@SuppressWarnings("unused")
	private boolean _updlodFile;
	private Vector<ZFormComponent> zFormComponents = new Vector<ZFormComponent>();

	public ZFormContainer(String _name) {
		super(_name);
	}

	public String get_action() {
		return _action;
	}

	public void set_action(String _action) {
		this._action = _action;
	}

	public String getMethode() {
		return _methode;
	}

	public void setMethode(String methode) {
		_methode = methode;
	}

	public boolean is_updlodFile() {
		boolean ret = false;
		for (int i = 0; i < zFormComponents.size(); i++) {
			if (zFormComponents.elementAt(i).get_type() == Statics.fileForm)
				;
			ret = true;
		}
		return ret;
	}

	public void set_updlodFile(boolean _updlodFile) {
		this._updlodFile = _updlodFile;
	}

	public void addzFormComponents(ZFormComponent zFormComponent) {
		this.zFormComponents.add(zFormComponent);
	}

	public String generateTag() {

		String form = "<form name=\"" + this._name + "\" method=\""
				+ getMethode() + "\"";
		if (get_action() != "") {
			form = form + " action=\"" + this.get_action() + "\"";
		}
		if (is_updlodFile()) {
			form = form + " enctype=\"multipart/form-data\"";
		}
		form = form + "/>";

		for (int i = 0; i < this.zFormComponents.size(); i++) {
			form = form + zFormComponents.elementAt(i).generateTag();
		}
		ZButton button = new ZButton(this._name, this._name, true);
		form = form + button.generateTag();
		form = form + "</form>";
		return form;
	}

	@Override
	public boolean isExistComponent(ZComponent zComponent) {
		int i = 0;
		boolean ret = false;
		while (i < this.zFormComponents.size() && ret == false) {

			if (this.zFormComponents.elementAt(i).hashCode() == zComponent
					.hashCode()) {
				ret = true;
			}
			i++;
		}
		return ret;
	}

}
