import java.sql.SQLException;

import com.hippocampus.fromzdktosgbd.engine.ZSgbdConnexion;
import com.hippocampus.onto.ZChoiceWithValue;
import com.hippocampus.zabstacts.ZObject;
import com.hippocampus.zformcomponent.ZCheckBox;
import com.hippocampus.zformcomponent.ZFormComponent;
import com.hippocampus.zformcomponent.ZFormContainer;
import com.hippocampus.zformcomponent.ZRadio;
import com.hippocampus.zformcomponent.ZSelect;
import com.hippocampus.zformcomponent.ZText;


public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		
		
		/*
		ZText text = new ZText("qs");
		ZText text2 = new ZText("Zied", "eeee", "dsds", 0);
		//System.out.println(text.generateTag());
		//System.out.println(text2.generateTag());
		
		ZObject formContainer = new ZFormContainer("Ajout");
		formContainer.addzFormComponents(text);
		formContainer.addzFormComponents(text2);
		System.out.println(formContainer.generateTag());
		ZMenu z = new ZMenu("Ajouter", formContainer);
		ZMenu zMenu = new ZMenu("ds", formContainer);
		z.addZMenuChield(zMenu);
		
		
		
		ZObject object ;
		ZObject zObject;
		ZObject zObject2;
		ZText tx1 = new ZText("dsdd");
		ZText tx2 = new ZText("dd");
		ZFormContainer container = new ZFormContainer("test");
		ZFormContainer container2 = new ZFormContainer("test2");
		
		
		container.addzFormComponents(tx1);
		container2.addzFormComponents(tx2);
		
		//object.addRelationM2M(container, container2, container., zComponent2);
		System.out.println(container.isExistComponent(tx1));*/
		
		
		ZObject formulaire = new ZFormContainer("Test3");
		ZText text =new ZText("ee","","",10,true,true);
		
		//text.addChoice(new ZChoice("d"));
		formulaire.addzFormComponents(text);
		ZFormComponent zselect =new ZSelect("selecté",true,true);
		
		zselect.addChoice(new ZChoiceWithValue("A", "1"));
		ZFormComponent chckbox=new ZCheckBox("select","OK",true,true);
		formulaire.addzFormComponents(chckbox);
		//chckbox.addChoice(new ZChoiceWithValue("A", "1"));
		//System.out.println(formulaire.generateTag());
		System.out.println(chckbox.generateTag());
		ZFormComponent radio = new ZRadio("radio", true, true);
		radio.addChoice(new ZChoiceWithValue("choice1","value1"));
		radio.addChoice(new ZChoiceWithValue("choice2","value2"));
		System.out.println(radio.generateTag());
		zselect.addChoice(new ZChoiceWithValue("d","d"));
		System.out.println(zselect.generateTag());
		System.out.println(text.generateTag());
		formulaire.addzFormComponents (zselect);
		formulaire.addzFormComponents (chckbox);
		formulaire.addzFormComponents (radio);
		System.out.println(formulaire.generateTag());
		
		text.insertZComponent();

	}  

}
