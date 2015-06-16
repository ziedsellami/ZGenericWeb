package com.hippocampus.zabstacts;

import java.util.Vector;

import com.hippocampus.relations.ZM2MRelations;
import com.hippocampus.relations.ZM2ORelations;
import com.hippocampus.relations.ZO2MRelations;
import com.hippocampus.relations.ZO2ORelations;
import com.hippocampus.zdk.ZComponent;
import com.hippocampus.zdk.ZRelations;
import com.hippocampus.zformcomponent.ZFormComponent;
import com.hippocampus.zinterfaces.ZObjectInterface;

public abstract class ZObject implements ZObjectInterface {
	protected String _name;
	private Vector<ZRelations> relations;

	protected ZObject(String _name) {
		this._name = _name;
	}

	public abstract void addzFormComponents(ZFormComponent zFormComponent);

	public abstract String generateTag();

	public void one2one(ZObject zobject2, ZComponent zComponent) {
		ZRelations.initRelations();
		ZRelations m2mrelations = new ZO2ORelations(this, zobject2, zComponent);
		this.relations.add(m2mrelations);
	}

	public void many2one(ZObject zobject2, ZComponent zComponent) {
		ZRelations.initRelations();
		ZRelations m2mrelations = new ZM2ORelations(this, zobject2, zComponent);
		this.relations.add(m2mrelations);
	}

	public void many2many(ZObject zObject2, ZComponent zComponent,
			ZComponent zComponent2) {
		ZRelations.initRelations();
		ZRelations m2mrelations = new ZM2MRelations(this, zObject2, zComponent,
				zComponent2);
		this.relations.add(m2mrelations);
	}

	public void one2many(ZObject zobject2, ZComponent zComponent) {
		ZRelations.initRelations();
		ZRelations m2mrelations = new ZO2MRelations(this, zobject2, zComponent);
		this.relations.add(m2mrelations);

	}

	public abstract boolean isExistComponent(ZComponent zComponent);

}
