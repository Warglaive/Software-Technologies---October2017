﻿using System;
using System.Collections.Generic;
using System.Data.Entity;
using System.Linq;
using System.Net;
using System.Web;
using System.Web.Mvc;
using Blog.Models;

namespace Blog.Controllers
{
    public class ArticleController : Controller
    {
        // GET: Article
        public ActionResult Index()
        {
            return RedirectToAction("List");
        }
        //
        //GET: Article/List
        public ActionResult List()
        {
            using (var database = new BlogDbContext())
            {
                //get articles from database
                var articles = database.Articles
                    .Include(a => a.Author)
                    .ToList();
                return View(articles);
            }
        }
        //Get Article/Details
        public ActionResult Details(int? id)
        {
            if (id == null)
            {
                return new HttpStatusCodeResult(HttpStatusCode.BadRequest);
            }
            using (var database = new BlogDbContext())
            {
                var article = database.Articles.Where(a => a.Id == id)
                    .Include(a => a.Author)
                    .First();
                //Get article from database
                if (article == null)
                {
                    return HttpNotFound();
                }
                else
                {
                    return View(article);
                }
            }
        }
        //GET: Article/Create
        public ActionResult Create()
        {
            return View();
        }
        //POST: Article/Create
        [HttpPost]
        public ActionResult Create(Article article)
        {
            if (ModelState.IsValid)
            {
                using (var database = new BlogDbContext())
                {
                    //Get author id
                    var authorId = database.Users.Where(u => u.UserName == this.User.Identity.Name)
                        .First().Id;
                    //Set articles author
                    article.AuthorId = authorId;
                    //save articles in DB
                    database.Articles.Add(article);
                    database.SaveChanges();
                    return RedirectToAction("Index");
                }
            }
            return View(article);
        }
        //Get Article/Delete
        public ActionResult Delete(int? id)
        {
            if (id == null)
            {
                return new HttpStatusCodeResult(HttpStatusCode.BadRequest);
            }
            using (var database = new BlogDbContext())
            {
                //get Article from database
                var article = database.Articles
                    .Where(a => a.Id == id)
                    .Include(a => a.Author)
                    .First();
                //check if article exists
                if (article == null)
                {
                    return HttpNotFound();
                }
                else
                {
                    return View(article);
                }
            }
        }
        //POST: Article/Delete
        [HttpPost]
        [ActionName("Delete")]
        public ActionResult DeleteConfirmed(int? id)
        {
            if (id == null)
            {
                return new HttpStatusCodeResult(HttpStatusCode.BadRequest);
            }
            else
            {
                using (var database = new BlogDbContext())
                {
                    //get article from DB
                    var article = database.Articles.Where(a => a.Id == id)
                        .Include(a => a.Author)
                        .First();
                    //if article dont exists
                    if (article == null)
                    {
                        return HttpNotFound();
                    }
                    //remove article from db if exist
                    else
                    {
                        database.Articles.Remove(article);
                        database.SaveChanges();
                        return RedirectToAction("Index");
                    }
                }
            }
        }
    }
}