//    KrOS POS  - Open Source Point Of Sale
//    Copyright (c) 2009-2018 uniCenta
//    https://unicenta.com
//
//    This file is part of KrOS POS
//
//    KrOS POS is free software: you can redistribute it and/or modify
//    it under the terms of the GNU General Public License as published by
//    the Free Software Foundation, either version 3 of the License, or
//    (at your option) any later version.
//
//   KrOS POS is distributed in the hope that it will be useful,
//    but WITHOUT ANY WARRANTY; without even the implied warranty of
//    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//    GNU General Public License for more details.
//
//    You should have received a copy of the GNU General Public License
//    along with KrOS POS.  If not, see <http://www.gnu.org/licenses/>.

package com.openbravo.pos.payment;

import com.openbravo.pos.forms.AppProperties;


/**
     * Creates a new instance of PaymentGatewayFac
 */
public class PaymentGatewayFac {
    
    /** Creates a new instance of PaymentGatewayFac */
    private PaymentGatewayFac() {
    }
    
    public static PaymentGateway getPaymentGateway(AppProperties props) {
        
        String sReader = props.getProperty("payment.gateway");
// JG 16 May 12 use switch
        switch (sReader) {
            case "external":
                return new PaymentGatewayExt();
            case "Dejavoo":
//TODO move to external                 return new PaymentGatewayDejavoo();
                throw new UnsupportedOperationException("Not supported PaymentGateway: Dejavoo");
            case "PaymentSense":
//TODO move to external                return new PaymentGatewayPaymentSense();
                throw new UnsupportedOperationException("Not supported PaymentGateway: PaymentSense");
            case "Vantiv":
//                return new PaymentGatewayVantiv();                
            default:
                return null;
        }
    }      
}
