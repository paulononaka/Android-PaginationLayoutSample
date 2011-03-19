/*
 * Copyright (C) 2011,  Paulo Henrique Nonaka - paulononaka@gmail.com
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
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