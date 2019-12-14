import { Component, OnInit } from '@angular/core';
import {CdkDragDrop, moveItemInArray} from '@angular/cdk/drag-drop';
import { MatChipInputEvent } from '@angular/material';
import { ENTER, COMMA } from '@angular/cdk/keycodes';
@Component({
  selector: 'app-design',
  templateUrl: './design.component.html',
  styleUrls: ['./design.component.css']
})
export class DesignComponent implements OnInit {
remove1:boolean=true;
input1:number = 0;
input2:number = 0;
input3:number = 0;
input4:number = 0;
input5:number = 0;

  data = 
    {
      title: 'HTML',
      url:
        'https://upload.wikimedia.org/wikipedia/commons/thumb/6/61/HTML5_logo_and_wordmark.svg/1200px-HTML5_logo_and_wordmark.svg.png',
      desc: 'Used to build pages of web apps for various technologies.',
      progress: 70
    }

template:string="";
var1:string;
idname:string;
modal_input:string;
  constructor() { }

  ngOnInit() {
  }
  timePeriods = [
    'Bronze age',
    'Iron age',
    'Middle ages',
    'Early modern period',
    'Long nineteenth century'
  ];

  drop(event: CdkDragDrop<string[]>) {
    moveItemInArray(this.timePeriods, event.previousIndex, event.currentIndex);
  }
  Remove(i){
    console.log(i)
    document.getElementById(i).innerHTML="";
    // this.input3 = this.input3 - 1;
  }
  Input1(){
    this.input1 = this.input1 + 1;
    this.template=this.template+`<div class="form-group">
      <label for="username"><span class="text-bold ">Username</span></label>
      <input type="text" name="username"  class="form-control" placeholder="Enter Username"
        aria-describedby="helpId">
      <!-- <small id="helpId" class="text-muted">Help text</small> -->
    </div>`
  }
  Input2(){
    this.input2 = this.input2 + 1;
  }
  Input3(){
    this.input3 = this.input3 + 1;
  }
  Input4(){
    this.input4 = this.input4 + 1;
  }
  Input5(){
    this.input5 = this.input5 + 1;
  }
  arrayTwo(n: number): number[] {
    return [...Array(n).keys()];
  }

  update(i){
    document.getElementById(this.idname).innerHTML = i.value;
  }
  fun1(i){
    this.idname = i;
  }
  visible = true;
  selectable = true;
  removable = true;
  addOnBlur = true;

  emailValid:boolean = false;

  availableColors: DemoColor[] = [
    { name: 'none', color: 'gray' },
    { name: 'Primary', color: 'primary' },
    { name: 'Accent', color: 'accent' },
    { name: 'Warn', color: 'warn' }
  ];

  // Enter, comma
  separatorKeysCodes = [ENTER, COMMA];

  // fruits = [{ name: 'Lemon' }, { name: 'Lime' }, { name: 'Apple' }];

  fruits = [];


  add(event: MatChipInputEvent): void {
    const input = event.input;
    let value = event.value;

    // console.log("value : " , value);

    //  var a =  value.split('@');

     this.emailValid = false;

    //  email validation

    var re = /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
    //  return re.test(email); 

     if(!re.test(value)){

       console.log('not an email')
       this.emailValid = true;
       value = '';

     }else{
        console.log("Email added")
        // Add our fruit
        if ((value || '').trim()) {
          this.fruits.push({ name: value.trim() });
        }
     }


      
        // Reset the input value
      if (input) {
        input.value = '';
      }


   
  }

  remove(fruit: any): void {
    const index = this.fruits.indexOf(fruit);

    if (index >= 0) {
      this.fruits.splice(index, 1);
    }
  }
}
