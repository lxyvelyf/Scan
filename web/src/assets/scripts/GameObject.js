const GAME_OBJECT = [];

export class GameObject {
    constructor() {
        GAME_OBJECT.push(this);
        this.timedelta = 0;
        this.has_called_start = false;
    }

    start() {

    }

    update() {

    }

    on_destory() {//删除之前执行

    }

    destory() {
        this.on_destory();
        for (let i in GAME_OBJECT) {
            const obj = GAME_OBJECT[i];
            if (obj === this) {
                GAME_OBJECT.splice(i);
                break;
            }
        }
    }
}

let last_timestamp;
const step = timestamp => {
    for(let obj of GAME_OBJECT){
        if(!obj.has_called_start){
            obj.has_called_start=true;
            obj.start();
        }else{
            obj.timedelta=timestamp-last_timestamp;
            obj.update();
        }
    }
    last_timestamp=timestamp;
    requestAnimationFrame(step)
}

requestAnimationFrame(step)
