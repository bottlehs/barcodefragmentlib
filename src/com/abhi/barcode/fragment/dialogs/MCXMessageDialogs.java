package com.abhi.barcode.fragment.dialogs;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;

public class MCXMessageDialogs extends DialogFragment {
	
	private IMCXDialogCreator mCreator;
	private int mWhat;
	
	public MCXMessageDialogs(IMCXDialogCreator creator, int what) {
		mCreator = creator;
		mWhat = what;
	}
	
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        return mCreator.createDialog(mWhat);
    }
}