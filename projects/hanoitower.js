var canvas = document.getElementById("hanoitower");
var ctx = canvas.getContext("2d");

var width = canvas.width;
var height = canvas.height;

function Disk(size) {
  this.size = size;
}

var pole1 = [];
var pole2 = [];
var pole3 = [];

pole1[0] = new Disk(3);
pole1[1] = new Disk(2);
pole1[2] = new Disk(1);

function drawPoles() {
  ctx.strokeStyle="brown";
  ctx.fillRect(1/9 * width, 1/5 * height, 1/9 * width, 3/5 * height);
  ctx.fillRect(4/9 * width, 1/5 * height, 1/9 * width, 3/5 * height);
  ctx.fillRect(7/9 * width, 1/5 * height, 1/9 * width, 3/5 * height);
}

function drawDisks() {
  ctx.strokeStyle="blue";
  
  for (int i = 0; i < pole1.size; i++) {
    ctx.drawRect(1/9 * width - (pole1[i].size * 5), (4/5 * height) - 10, pole1[1].size * 10, 10);
  }
  for (int i = 0; i < pole2.size; i++) {
    ctx.drawRect(1/9 * width - (pole2[i].size * 5), (4/5 * height) - 10, pole2[1].size * 10, 10);
  }
  for (int i = 0; i < pole3.size; i++) {
    ctx.drawRect(1/9 * width - (pole3[i].size * 5), (4/5 * height) - 10, pole3[1].size * 10, 10);
  }
}

function draw() {
  ctx.beginPath();
  drawPoles();
  drawDisks();
  ctx.fill();
  ctx.closePath();
}

draw();
