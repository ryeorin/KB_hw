<template>
  <div class="row">
  <div class="col p-3">
  <router-link class="btn btn-primary" to="/todos/add">
 할일 추가
 </router-link>
  <button class="btn btn-primary ms-1" @click="fetchTodoList">
 새로 고침
 </button>
  </div>
  </div>
  <div class="row">
  <div class="col p-3">
  <ul class="list-group">
  <TodoItem v-for="todoItem in todoList" :key="todoItem.id" :todoItem="todoItem" />
  </ul>
  </div>
  <span>완료된 할일 : {{doneCount}}</span>
  </div>
</template>

<script setup>
 import { useRouter } from 'vue-router';
 import { useTodoListStore } from '@/stores/todoList.js'
 defineProps({
 todoItem: { Type: Object, required:true }
 })
 const router = useRouter();
 const todoListStore = useTodoListStore();
 const { deleteTodo, toggleDone } = todoListStore;
</script>
