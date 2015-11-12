package br.com.lab4.utils;

/* Classe para Definir a quantidade de Caracteres que o campo irá aceitar */

import javax.swing.text.*;
   
public class DefineQtdeCaracter extends PlainDocument
{
	private final int tamanhoCampo;
 
	public DefineQtdeCaracter(int maxlen) {
		super();
		tamanhoCampo = maxlen;
	}

	public void insertString(int offset, String str, AttributeSet attr)
            throws BadLocationException {
	if (str == null) return;

	if (tamanhoCampo <= 0)        // aceitara qualquer no. de caracteres
	{
		super.insertString(offset, str, attr);
		return;
	}

	int ilen = (getLength() + str.length());
	if (ilen <= tamanhoCampo)    // se o comprimento final for menor...
		super.insertString(offset, str, attr);   // ...aceita str
	else
	{
		if (getLength() == tamanhoCampo) return; // nada a fazer
		String newStr = str.substring(0, (tamanhoCampo - getLength()));

		super.insertString(offset, newStr, attr);
	}
}
}
