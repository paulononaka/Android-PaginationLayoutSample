/*
 * Copyright (C) 2011, Paulo Henrique Nonaka - paulononaka@gmail.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.paulononaka;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;

/**
 * An example of how to use the PaginationLayout.
 * 
 * @author Paulo Henrique Nonaka
 * @email paulononaka@gmail.com
 */
public class Sample extends Activity {

	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // creates the Pagination Layout
        PaginationLayout paginationLayout = new PaginationLayout(this);
        paginationLayout.setLayoutParams(new LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.FILL_PARENT));
        
        // creates content only for sample
        TableLayout table = new TableLayout(this);
        table.setLayoutParams(new LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.FILL_PARENT));
        table.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL);
        
        TableRow row = new TableRow(this);
        row.setLayoutParams(new LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.FILL_PARENT));
        table.addView(row);
        
        TableRow row2 = new TableRow(this);
        row2.setLayoutParams(new LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.FILL_PARENT));
        table.addView(row2);

        for(int i = 0; i< 50;i++){
            Button button = new Button(this);
            button.setText("Button " + i);
            if (i%2==0) {
            	row.addView(button);
            } else {
            	row2.addView(button);
            }
        }
        
        // add the content in pagination
        paginationLayout.addView(table);
        // set pagination layout
        setContentView(paginationLayout);
    }
}