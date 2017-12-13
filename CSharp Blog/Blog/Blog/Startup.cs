using System.Data.Entity;
using Microsoft.Owin;
using Blog.Migrations;
using Blog.Models;
using Owin;

[assembly: OwinStartupAttribute(typeof(Blog.Startup))]
namespace Blog
{
    public partial class Startup
    {
        public void Configuration(IAppBuilder app)
        {
            Database.SetInitializer(
                new MigrateDatabaseToLatestVersion<BlogDbContext, Configuration>());
            ConfigureAuth(app);
        }
    }
}
