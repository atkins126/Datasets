package org.knowm.datasets.hjabirdsong;

import org.knowm.datasets.common.business.DatasetsDAO;

/**
 * @author timmolter
 */
public class HJABirdsongParentDAO extends DatasetsDAO {

  public static void init(String dataFilesDir) {

    String dataFileID = "0ByP7_A9vXm17SWZJa09fWnFxbGM";
    String propsFileID = "0ByP7_A9vXm17RS1NMllKelJ0MlE";
    String scriptFileID = "0ByP7_A9vXm17YXlZelRxV01ZdDg";
    String lobsFileID = "0ByP7_A9vXm17WDBoS25pMHZmR0E";

    init("DB_HJA_BIRDSONG", dataFilesDir, dataFileID, propsFileID, scriptFileID, lobsFileID, true);
  }

}
