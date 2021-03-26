package com;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Button;
import org.zkoss.zul.Checkbox;
import org.zkoss.zul.Datebox;
import org.zkoss.zul.Radiogroup;
import org.zkoss.zul.Textbox;

public class Registrazione extends SelectorComposer<Component>{

	@Wire
	private Textbox id_nome;

	@Wire
	private Radiogroup id_genere;

	@Wire
	private Datebox compleanno;

	@Wire
	private Checkbox accetta_i_termini;

	@Wire
	private Button submit;

	@Listen("onCheck=#accetta_i_termini")
	public void submitRegistrazione() {

		if (accetta_i_termini.isChecked()) {
			submit.setDisabled(false);
		} else {
			submit.setDisabled(true);
		}

	}
	
	
	@Listen("onClick=#resettaButton")
	public void resettaRegistrazione() {
		
		submit.setDisabled(true);
		
		accetta_i_termini.setChecked(false);
		
		compleanno.setValue(null);
		id_genere.setSelectedIndex(0);
		id_nome.setValue("");
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
