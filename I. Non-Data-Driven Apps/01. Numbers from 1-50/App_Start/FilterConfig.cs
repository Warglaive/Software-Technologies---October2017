using System.Web;
using System.Web.Mvc;

namespace _01.Numbers_from_1_50
{
    public class FilterConfig
    {
        public static void RegisterGlobalFilters(GlobalFilterCollection filters)
        {
            filters.Add(new HandleErrorAttribute());
        }
    }
}
