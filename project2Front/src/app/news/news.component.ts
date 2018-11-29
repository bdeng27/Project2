import { Component } from '@angular/core';

import { NewsService } from './news.service';

declare var $:any;

@Component({
  templateUrl: './news.component.html',
  styleUrls: ['./news.component.css']
})

export class NewsComponent{
	news = {};
	constructor(private NewsService: NewsService) {
		this.NewsService.getNews().subscribe(data => this.news = data);
		}
}


