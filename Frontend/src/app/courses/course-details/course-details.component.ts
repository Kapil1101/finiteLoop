import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { CourseService } from '../courses.service';

@Component({
  selector: 'app-course-details',
  templateUrl: './course-details.component.html',
  styleUrls: ['./course-details.component.css']
})
export class CourseDetailsComponent implements OnInit {
  id: string;
  course: any;
  constructor(
    private route: ActivatedRoute,
    private courseService: CourseService
  ) {}
  ngOnInit() {
    this.route.params.subscribe(param => (this.id = param.cid));
    this.course = this.courseService.getSingleCourse(this.id);
  }
}
