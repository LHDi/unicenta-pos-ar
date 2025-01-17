//    KrOS POS  - Open Source Point Of Sale
//    Copyright (c) 2009-2018 uniCenta & previous Openbravo POS works
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
//    along with this program.  If not, see <http://www.gnu.org/licenses/>.

package com.openbravo.data.loader;

import java.util.*;
import com.openbravo.basic.BasicException;

/**
 *
 * @author JG uniCenta
 */
public class NormalBuilder implements ISQLBuilderStatic {
    
    private String m_sSentence;

    public NormalBuilder(String sSentence) {
        m_sSentence = sSentence;
    }
    

    @Override
    public String getSQL(SerializerWrite sw, Object params) throws BasicException {
        
        NormalParameter mydw = new NormalParameter(m_sSentence);
        if (sw != null) {
            sw.writeValues(mydw, params);
        }
        return mydw.getSentence();
    }   
}
