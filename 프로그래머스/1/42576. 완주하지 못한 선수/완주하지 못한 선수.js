function solution(participant, completion) {
    var answer = '';
    const hashMap = new Map();
    
    for(const name of participant){
        if(hashMap.get(name)){
            hashMap.set(name,hashMap.get(name)+1);
        }else{
            hashMap.set(name,1);
        }
    }
    for(const name of completion){
        hashMap.set(name,hashMap.get(name)-1)
    }
    for(const [name,count] of hashMap){
        if(count === 1){
            return name
        }
    }
    return answer;
}