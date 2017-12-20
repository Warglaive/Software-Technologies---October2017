using System;
using System.Collections.Generic;
using System.Linq;
using System.Web.Mvc;
using TeisterMask.Models;

namespace TeisterMask.Controllers
{
    [ValidateInput(false)]
    public class TaskController : Controller
    {
        [HttpGet]
        [Route("")]
        public ActionResult Index()
        {
            using (var context = new TeisterMaskDbContext())
            {
                List<Task> tasks = context.Tasks.ToList();
                return View(tasks);
            }
        }

        [HttpGet]
        [Route("create")]
        public ActionResult Create()
        {
            return View();
        }

        [HttpPost]
        [Route("create")]
        [ValidateAntiForgeryToken]
        public ActionResult Create(Task task)
        {
            using (var context = new TeisterMaskDbContext())
            {
                context.Tasks.Add(task);
                context.SaveChanges();
                return Redirect("/");
            }
        }

        [HttpGet]
        [Route("edit/{id}")]
        public ActionResult Edit(int id)
        {
            using (var context = new TeisterMaskDbContext())
            {
                Task tasksFromDb = context.Tasks.Find(id);
                return View(tasksFromDb);
            }
        }

        [HttpPost]
        [Route("edit/{id}")]
        [ValidateAntiForgeryToken]
        public ActionResult EditConfirm(int id, Task taskModel)
        {
            using (var context = new TeisterMaskDbContext())
            {
                Task tasksFromDb = context.Tasks.Find(id);
                tasksFromDb.Title = taskModel.Title;
                tasksFromDb.Status = taskModel.Status;
                context.SaveChanges();
                return Redirect("/");
            }
        }
    }
}