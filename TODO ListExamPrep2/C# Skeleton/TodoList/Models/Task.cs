﻿using System.ComponentModel.DataAnnotations;

namespace TodoList.Models
{
    public class Task
    {
        [Required]
        public int Id { get; set; }
        [Required]
        [StringLength(50)]
        public string Title { get; set; }
        [Required]
        public string Comments { get; set; }
    }
}