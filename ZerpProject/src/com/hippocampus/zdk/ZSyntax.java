package com.hippocampus.zdk;

import com.hippocampus.project.Z;

public class ZSyntax extends Z {
	public static boolean verifName(String _name) {
		boolean ret = false;
		if (_name.toUpperCase().startsWith("A")
				|| _name.toUpperCase().startsWith("B")
				|| _name.toUpperCase().startsWith("C")
				|| _name.toUpperCase().startsWith("D")
				|| _name.toUpperCase().startsWith("E")
				|| _name.toUpperCase().startsWith("F")
				|| _name.toUpperCase().startsWith("G")
				|| _name.toUpperCase().startsWith("H")
				|| _name.toUpperCase().startsWith("I")
				|| _name.toUpperCase().startsWith("J")
				|| _name.toUpperCase().startsWith("K")
				|| _name.toUpperCase().startsWith("L")
				|| _name.toUpperCase().startsWith("M")
				|| _name.toUpperCase().startsWith("N")
				|| _name.toUpperCase().startsWith("O")
				|| _name.toUpperCase().startsWith("P")
				|| _name.toUpperCase().startsWith("T")
				|| _name.toUpperCase().startsWith("R")
				|| _name.toUpperCase().startsWith("U")
				|| _name.toUpperCase().startsWith("Q")
				|| _name.toUpperCase().startsWith("S")
				|| _name.toUpperCase().startsWith("A")
				|| _name.toUpperCase().startsWith("V")
				|| _name.toUpperCase().startsWith("A")
				|| _name.toUpperCase().startsWith("W")
				|| _name.toUpperCase().startsWith("X")
				|| _name.toUpperCase().startsWith("Y")
				|| _name.toUpperCase().startsWith("Z")
				|| _name.toUpperCase().startsWith("W")
				|| _name.toUpperCase().startsWith("_")) {
			ret = true;
		} else {
			ret = false;
			try {
				throw new ZExceptions("ZAM000000003", true);
			} catch (ZExceptions e) {

				e.printStackTrace();
			}
		}
		return ret;
	}
}
