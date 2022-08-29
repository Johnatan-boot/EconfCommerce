import { Component, OnInit } from '@angular/core';
import { Images } from 'src/app/models/images/images';

@Component({
  selector: 'app-bolostradcionais',
  templateUrl: './bolostradcionais.component.html',
  styleUrls: ['./bolostradcionais.component.scss'],
})
export class BolostradcionaisComponent implements OnInit {
  imagens: Images[] = [];

  urlBannerBoloT:string = './assets/bolotradcional/slidebolot13Alt.png';

  constructor() { }

  ngOnInit(): void {
  }

}
