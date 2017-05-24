/*****************************************************************************
 *  Copyright (c) 2017 by ACI Worldwide Inc.                                 *
 *  All rights reserved.                                                     *
 *                                                                           *
 *  This software is the confidential and proprietary information of ACI     *
 *  Worldwide Inc ("Confidential Information"). You shall not disclose such  *
 *  Confidential Information and shall use it only in accordance with the    *
 *  terms of the license agreement you entered with ACI Worldwide Inc.       *
 ****************************************************************************/
package ru.kpfu.itis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {

  @RequestMapping({"/cases/**"})
  public String index() {
    return "forward:/index.html";
  }

}
