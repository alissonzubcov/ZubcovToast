/**
MIT License

Copyright (c) 2020 Alisson Zubcov

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.

 **/

package org.godotengine.godot;

import android.app.Activity;
import com.godot.game.R;
import android.widget.Toast;


public class ZubcovToast extends Godot.SingletonBase {

    private Godot activity;

	public void showToast(final String mensagem, final boolean max){
		int duracao_temporaria = Toast.LENGTH_SHORT;
		if (max)
			duracao_temporaria = Toast.LENGTH_LONG;
		final int duration = duracao_temporaria;

		 activity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
				 Toast toast = Toast.makeText(activity, mensagem, duration);
				 toast.show();
            }
        });
		}
	
	static public Godot.SingletonBase initialize(Activity p_activity) {
		return new ZubcovToast(p_activity);
	}
    public ZubcovToast(Activity p_activity) {
        this.activity = (Godot) p_activity;
        registerClass("ZubcovToast", new String[]{"showToast"});
    }

}
