import { Component, OnInit } from '@angular/core';
import { CourseService } from './courses.service';

@Component({
  selector: 'app-courses',
  templateUrl: './courses.component.html',
  styleUrls: ['./courses.component.css']
})
export class CoursesComponent implements OnInit {
  courses: any[];
 
  constructor(private courseService: CourseService) {
    this.courses = this.courseService.getALlCourses();
  }

  ngOnInit() {}
}
