import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class CourseService {
  items1 = [
    {
      cid: 1,
      title: 'HTML',
      url:
        'https://upload.wikimedia.org/wikipedia/commons/thumb/6/61/HTML5_logo_and_wordmark.svg/1200px-HTML5_logo_and_wordmark.svg.png',
      desc: 'Used to build pages of web apps for various technologies.',
      progress: 2
    },
    {
      cid: 2,
      title: 'CSS',
      url:
        'https://upload.wikimedia.org/wikipedia/commons/thumb/d/d5/CSS3_logo_and_wordmark.svg/1200px-CSS3_logo_and_wordmark.svg.png',
      desc: 'Used to style various page across web apps and pages.',
      progress: 33
    },
    {
      cid: 3,
      title: 'BOOTSRAP',
      url:
        'https://getbootstrap.com/docs/4.0/assets/brand/bootstrap-social-logo.png',
      desc: 'Get started with Bootstrap, the world’s most popular framework.',
      progress: 57
    },
    {
      cid: 4,
      title: 'ANGULAR',
      url: 'https://angular.io/assets/images/logos/angular/angular.svg',
      desc: 'Learn one way to build applications with Angular and reuse',
      progress: 81
    }
  ];
  constructor() {}

  getALlCourses = () => {
    return this.items1;
  }

  getSingleCourse = cid => {
    return this.items1[+cid - 1];
  }
}
