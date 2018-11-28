import { Injectable } from '@angular/core';
import { Http, Response } from '@angular/http';
import 'rxjs/add/operator/map';


@Injectable()
export class NewsService {
	constructor (
		private http: Http
	) {}
	
	getNews() {
		return this.http.get(`https://hn.algolia.com/api/v1/search_by_date?query=finance&tags=story`).map((res:Response) => res.json());
		}
		}