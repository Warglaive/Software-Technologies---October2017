using Calculator_CSharp.Models;
using System.Web.Mvc;
using System;

namespace Calculator_CSharp.Controllers
{
    public class HomeController : Controller
    {
        public ActionResult Index(Calculator calculator)
        {
            return View(calculator);
        }
        [HttpPost]
        public ActionResult Calculate(Calculator calculator)
        {
            calculator.Result = CalculateResult(calculator);
            return RedirectToAction("Index", calculator);
        }

        private double CalculateResult(Calculator calculator)
        {
            double result = 0;
            switch (calculator.Operator)
            {
                case "+":
                    result = calculator.LeftOperand + calculator.RightOperand;
                    break;
                case "-":
                    result= calculator.LeftOperand - calculator.RightOperand;
                    break;
                case "*":
                    result = calculator.LeftOperand * calculator.RightOperand;
                    break;
                case "/":
                    result = calculator.LeftOperand / calculator.RightOperand;
                    break;
                case "^":
                    result = Math.Pow(calculator.LeftOperand, calculator.RightOperand);
                    break;
                default:
                    result = 0;
                    break;
            }
            return result;
        }
    }
}