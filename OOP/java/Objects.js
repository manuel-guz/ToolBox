
//literal objects

let course = {
    property : 'value',
    learners:5,
    teacher:['jack', 'tom'],
    hour: 8,
    notification: function () {
        return 'classes finished at '+this.hour+' pm'
        
    }

}

console.log('the teacher names are: ' + course.teacher);
console.log(course.notification());

