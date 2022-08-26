import { Component, OnInit } from '@angular/core';
import { Images } from 'src/app/models/images/images';

@Component({
  selector: 'app-bolostradcionais',
  templateUrl: './bolostradcionais.component.html',
  styleUrls: ['./bolostradcionais.component.scss'],
})
export class BolostradcionaisComponent implements OnInit {
  imagens: Images[] = [];

  //urlBoloTrad1:string = './src/assets/bolotradcional/slidebolot12Alt.png';

  constructor() { }

  ngOnInit(): void {
  }

}
