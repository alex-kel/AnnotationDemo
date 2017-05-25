/*****************************************************************************
 *  Copyright (c) 2017 by ACI Worldwide Inc.                                 *
 *  All rights reserved.                                                     *
 *                                                                           *
 *  This software is the confidential and proprietary information of ACI     *
 *  Worldwide Inc ("Confidential Information"). You shall not disclose such  *
 *  Confidential Information and shall use it only in accordance with the    *
 *  terms of the license agreement you entered with ACI Worldwide Inc.       *
 ****************************************************************************/
package ru.kpfu.itis.utils;

import java.util.HashMap;
import java.util.Map;

public class Translator {

  private static Map<String, String> translations = new HashMap<String, String>(){
    {
      put("Entrepreneurs", "Предприниматели");
      put("StateBodies", "Государственные органы");
      put("Subjects", "Предметы");
      put("LegalEntities", "Юридические лица");
      put("Enterprises", "Компании");
      put("Individuals", "Лица");
      put("Dates", "Даты");
      put("MovableThings", "Движимые вещи");
      put("Defendant", "Подсудимый");
      put("Complainant", "Истец");
      //put("Simple_chemical", "Даты");
      put("Active", "Действующий");
      put("Close", "Решение");
      put("Paid", "Оплата");
      put("Conclusion", "Вывод");
      put("Satisfy", "удовлетворять");
      put("Refuse", "Отказаться");
      put("EventOfAnOffense", "Случай нарушения");
      put("SubjectsType", "Тип объекта");
      put("CourtLogicalActions", "Логические действия суда");
      put("TypesOfAction", "Типы действий");
      put("JudicialActs", "Судебные акты");
      put("DecreesOfTheGovernment", "Постановления правительства");
      put("PlaceOfAction", "Место действия");
      put("CitizensNotEntrepreneurs", "Граждане, не являющиеся предпринимателями");
      put("PointOfLaw", "Пункт права");
      put("NormsOfLaw", "Нормы права");
    }
  };

  public static String getRuType(String engType) {
    String out = translations.get(engType);
    return out == null ? "Факт" : out;
  }
}
