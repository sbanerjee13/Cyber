const text = document.querySelector('.title-h');
const splitText = ['|', 'C', 'Y', 'B', 'E', 'R', 'W', 'O', 'R', 'L', 'D'];
text.textContent = "";

for(let i = 0; i < splitText.length; i++){
    if(i === 0){
        text.innerHTML += "<span>" + splitText[i] + "</span>";
    }else{
    text.innerHTML += "<span class = 'text'>" + splitText[i] + "</span>";
    }
}

// initial "type" effect

function onTick() {
    if(counter < cursorEndCondition){
        const span = text.querySelectorAll('span')[0];
        if(counter % 2 != 0){
            span.classList.add('cursor');
        }else{
            span.classList.remove('cursor');
        }
        counter++;
    }else{
        const span = text.querySelectorAll('span')[char];
        span.classList.add('fade');
        char++;
        if(char === splitText.length){
            complete();
            return;
        }
    }
}

function complete() {
    clearInterval(timer);
    timer = null;
}

let char = 0;
let counter = 0;
const cursorEndCondition = 7;

let timer = setInterval(onTick, 220);

