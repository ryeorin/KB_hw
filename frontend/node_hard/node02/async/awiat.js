const fs = require('fs').promises;
async function readDirAsyn() {
try {
const files = await fs.readdir('./');  // Promise 객체를리턴하는비동기함수
console.log(files);
} catch (err) {
console.error(err);
}
}
readDirAsyn();