﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace AttendanceTracker_Web.Controllers.MVC
{
    public class HomeController : Controller
    {
        public ActionResult Index()
        {
            return View();
        }
    }
}