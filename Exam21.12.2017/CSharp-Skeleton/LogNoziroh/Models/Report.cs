using System.ComponentModel.DataAnnotations;

namespace LogNoziroh.Models
{
    public class Report
    {
        [Required]
        public int Id { get; set; }

        [Required]
        [StringLength(50)]
        public string Status { get; set; }

        [Required]
        public string Message { get; set; }

        [Required]
        public string Origin { get; set; }
    }
}