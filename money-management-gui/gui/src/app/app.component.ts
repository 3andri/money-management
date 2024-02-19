import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import {MatDivider} from "@angular/material/divider";
import {MatIcon} from "@angular/material/icon";
import {MatMenu} from "@angular/material/menu";
import {MatToolbar} from "@angular/material/toolbar";
import {MatSidenav, MatSidenavContainer, MatSidenavContent} from "@angular/material/sidenav";
import {MatListItem, MatNavList} from "@angular/material/list";
import {MatExpansionPanel, MatExpansionPanelHeader} from "@angular/material/expansion";

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, MatDivider, MatIcon, MatMenu, MatToolbar, MatSidenavContent, MatNavList, MatExpansionPanelHeader, MatExpansionPanel, MatSidenavContainer, MatSidenav, MatListItem],
  templateUrl: './app.component.html',
  styleUrl: './app.component.scss'
})
export class AppComponent {
  title = 'gui';
}
