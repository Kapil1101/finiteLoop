import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  constructor() {}
  items: number[];

  items1 = [
    {
      title: 'HTML',
      url:
        'https://upload.wikimedia.org/wikipedia/commons/thumb/6/61/HTML5_logo_and_wordmark.svg/1200px-HTML5_logo_and_wordmark.svg.png',
      desc: 'Used to build pages of web apps for various technologies.',
      progress: 2
    },
    // {
    //   title: 'CSS',
    //   url:
    //     'https://upload.wikimedia.org/wikipedia/commons/thumb/d/d5/CSS3_logo_and_wordmark.svg/1200px-CSS3_logo_and_wordmark.svg.png',
    //   desc: 'Used to style various page across web apps and pages.',
    //   progress: 33
    // },
    // {
    //   title: 'BOOTSRAP',
    //   url:
    //     'https://upload.wikimedia.org/wikipedia/commons/thumb/6/61/HTML5_logo_and_wordmark.svg/1200px-HTML5_logo_and_wordmark.svg.png',
    //   desc: 'Get started with Bootstrap, the world’s most popular framework.',
    //   progress: 57
    // },
    // {
    //   title: 'ANGULAR',
    //   url: 'https://www.google.com/url?sa=i&source=images&cd=&ved=2ahUKEwi8pPWW4evlAhWDeisKHTWHDrQQjRx6BAgBEAQ&url=https%3A%2F%2Fworldvectorlogo.com%2Flogo%2Fbootstrap-4&psig=AOvVaw283XQixUPWHi1QSpUFkMhD&ust=1573891562846566',
    //    desc: 'Learn one way to build applications with Angular and reuse',
    //   progress: 81
    // }
  ];
  ngOnInit() {
  }
}
