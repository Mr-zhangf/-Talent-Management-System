import { createApp } from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'
import { createApp } from 'vue'

import App from './App.vue'
import element from 'element-plus'
import 'element-plus/lib/theme-chalk/index.css'

const app = createApp(App)
app.use(element)

createApp(App).use(store).use(router).mount('#app')
