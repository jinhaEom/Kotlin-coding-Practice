function solution(numLog) {
    return numLog
        .map((val, i ,arr) => {
        if(i===0) return '';
        
        const diff = val - arr[i-1];
        if(diff === 1 ) return 'w';
        if(diff === -1) return 's';
        if(diff === 10) return 'd';
        if(diff === -10) return 'a';
    })
    .join('')
}