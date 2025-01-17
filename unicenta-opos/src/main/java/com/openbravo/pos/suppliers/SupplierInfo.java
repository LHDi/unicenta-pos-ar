//    KrOS POS
//    Copyright (c) 2009-2018 uniCenta
//    
//
//     
//
//    This program is free software: you can redistribute it and/or modify
//    it under the terms of the GNU General Public License as published by
//    the Free Software Foundation, either version 3 of the License, or
//    (at your option) any later version.
//
//    This program is distributed in the hope that it will be useful,
//    but WITHOUT ANY WARRANTY; without even the implied warranty of
//    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//    GNU General Public License for more details.
//
//    You should have received a copy of the GNU General Public License
//    along with KrOS POS.  If not, see <http://www.gnu.org/licenses/>.

package com.openbravo.pos.suppliers;

import com.openbravo.basic.BasicException;
import com.openbravo.data.loader.DataRead;
import com.openbravo.pos.domain.entity.businesspartner.BusinessPartner;

/** @author Jack Gerrard */


public class SupplierInfo extends BusinessPartner {
    
    private static final long serialVersionUID = 9093257536541L;

    public SupplierInfo(String id) {
        super(id);
    }

    public SupplierInfo(String id, String searchkey, String name) {
        super(id, searchkey, name);
    }

    public void readValues(DataRead dr) throws BasicException {
        setId(dr.getString(1));
        setName(dr.getString(2));
    } 

    
}