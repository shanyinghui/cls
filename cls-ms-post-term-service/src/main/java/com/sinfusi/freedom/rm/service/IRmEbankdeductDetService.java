package com.sinfusi.freedom.rm.service;

import java.util.Map;

public interface IRmEbankdeductDetService {
    Map createAllRmEbankDeductFile(String retamtType, String custClassId, String bankType) throws Exception;
}
