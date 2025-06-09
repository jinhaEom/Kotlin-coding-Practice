function solution(n) {
    var answer = 0;
    const c =String(n).split('').map(Number).sort((a,b)=> b-a).join("")
    return Number(c)
}